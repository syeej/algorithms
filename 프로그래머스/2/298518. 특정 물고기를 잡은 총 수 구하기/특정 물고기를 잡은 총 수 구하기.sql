-- fish_info에서 잡은 bass(fish type 0)과 snapper(fish type 1)의 수 -> fish_count
select count(*) as "FISH_COUNT"
from fish_info i
join fish_name_info n on i.fish_type = n.fish_type
where n.fish_name = "BASS" or n.fish_name = "SNAPPER";